
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { Layout } from "./components/layout";
import { AddWorkout } from "./pages/add-workout";
import { Home } from "./pages/home";
import { WorkoutDetails } from "./pages/workout-details";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<Home />} />
          <Route path="/add" element={<AddWorkout />} />
          <Route path="/workout/:id" element={<WorkoutDetails />} />
        </Route>
      </Routes>
    </BrowserRouter>

import { useState } from "react";
import { Header } from "./components/header";
import type { Workout } from "./types/workout"
import { WorkoutList } from "./components/workout-list";
import { WorkoutForm } from "./components/workout-form";

function App() {
  const [list, setList] = useState<Workout[]>([]);

  function addWorkout(workout:Workout) {
    setList((prev) => [...prev, workout])
  }

  return (
    <>
      <Header />
      <WorkoutForm onAdd={addWorkout}/>
      <WorkoutList workoutList={list} />
    </>

  );
}

export default App;