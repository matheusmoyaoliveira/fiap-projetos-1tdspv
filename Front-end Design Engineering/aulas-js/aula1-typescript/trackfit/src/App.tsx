import { Header } from "./components/header";
import { WorkoutCard } from "./components/workout-card";

function App() {
  return (
    <>
      <Header />
      <WorkoutCard
        id="1"
        date="20/02/2025"
        duration={60}
        intensity={1}
        title="Zumba"
      />
    </>
  );
}

export default App;
