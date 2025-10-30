from flask import Flask, request
import pickle
import pandas as pd

app = Flask(__name__)

@app.route("/", methods=["GET"])
def home():
    return "<h1>Bem vindo a sua API Matheus</h1>"

@app.route("/", methods=["POST"])
def predict():
    data = request.json
    data = pd.DataFrame(data)
    with open("modeloSalario.pkl", "rb") as f:
        model = pickle.load(f)
    return model.predict(data)

if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port=5001)