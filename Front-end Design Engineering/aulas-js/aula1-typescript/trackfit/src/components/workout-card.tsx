import type { Workout } from "../types/workout";


interface WorkoutCardProps {
  workout: Workout;
}

export function WorkoutCard({ workout }: WorkoutCardProps) {
  return (
    <div style={{ border: "1px solid #ccc", padding: 16, marginBottom: 12 }}>
      <h2>{workout.title}</h2>
      <p>Duração: {workout.duration} min</p>
      <p>Intensidade: {workout.intensity}/5</p>
      <p>Data: {workout.date}</p>
    </div>
  );
}
