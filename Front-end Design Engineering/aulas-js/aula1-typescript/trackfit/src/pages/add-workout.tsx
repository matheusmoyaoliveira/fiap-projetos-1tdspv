import { useCallback, useMemo, useState } from "react";
import { WorkoutForm } from "../components/workout-form";
import { WorkoutList } from "../components/workout-list";
import type { Workout } from "../types/workout";

export function AddWorkout() {
  const [workouts, setWorkouts] = useState<Workout[]>([]);

  const workoutTotal = useMemo(() => {
    return workouts.length;
  }, [workouts]);

  // renderiza todas as vezes que o componente é chamado
  // const workoutTotal2 = workouts.length;

  const workoutMinutes = useMemo(() => {
    let workoutMinutes: number = 0;

    workouts.forEach((workout) => {
      workoutMinutes += workout.duration;
    });

    const hours = Math.floor(workoutMinutes / 60);
    const minutes = workoutMinutes % 60;

    return `${hours}:${minutes}`;
  }, [workouts]);

  const addWorkout = useCallback((workout: Workout) => {
    setWorkouts((prev) => [...prev, workout]);
  }, []);

  const removeWorkout = useCallback((id: string) => {
    const workoutToDelete = workouts.findIndex((value) => {
      return value.id === id;
    });

    const updatedWorkouts = [...workouts];

    updatedWorkouts.splice(workoutToDelete, 1);

    setWorkouts(updatedWorkouts);

  }, [])

  // renderiza todas as vezes que o componente é chamado
  // function addWorkout2(workout: Workout) {
  //   setWorkouts((prev) => [...prev, workout]);
  // }

  return (
    <>
      <h2 className="font-bold text-blue-800 text-xl mb-3">
        Adicionar novo treino
      </h2>

      <p className="text-lg font-bold text-gray-600">
        Total de treinos: {workoutTotal}
      </p>

      <p>Tempo de treino: {workoutMinutes} horas</p>

      <WorkoutForm onAdd={addWorkout} />

      <WorkoutList removeWorkout={removeWorkout} workoutList={workouts} />
    </>
  );
}