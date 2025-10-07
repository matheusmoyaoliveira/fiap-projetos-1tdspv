import type { Workout } from "../types/workout";
import { WorkoutResume } from "./workout-resume";

interface WorkoutListProps {
  workoutList: Workout[];
  removeWorkout: (id: string) => void;
}

export function WorkoutList({ workoutList, removeWorkout }: WorkoutListProps) {
  return (
    <>
      {workoutList.map((value) => {
        return <WorkoutResume removeWorkout={removeWorkout} workout={value} />;
      })}
    </>
  );
}
