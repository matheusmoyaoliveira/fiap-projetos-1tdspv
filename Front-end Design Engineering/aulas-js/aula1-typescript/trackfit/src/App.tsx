import { BrowserRouter, Route, Routes } from "react-router-dom";
import { Layout } from "./components/layout";
import { AddWorkout } from "./pages/add-workout";
import { Home } from "./pages/home";
import { WorkoutDetails } from "./pages/workout-details";
import { NotFound } from "./pages/not-found";
import { lazy } from "react";
import { Suspense } from "react";
import { Loading } from "./components/loading";

const Home = lazy(() => 
  import('./pages/home').then(m => ({default: m.Home}))
);

const AddWorkout = lazy(() => 
  import('./pages/add-workout').then(m => ({default: m.AddWorkout}))
);

function App() {
  return (
    <BrowserRouter>

      <Suspense fallback ={<Loading />}>
        <Routes>
          <Route path="/" element={<Layout />}>
            <Route index element={<Home />} />
            <Route path="/add" element={<AddWorkout />} />
            <Route path="/workout/:id" element={<WorkoutDetails />} />
            <Route path="*" element={<NotFound />} />
          </Route>
        </Routes>
      </Suspense>
    </BrowserRouter>
  )
}

export default App;