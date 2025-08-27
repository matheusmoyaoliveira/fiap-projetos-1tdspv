import type { Workout } from "../types/workout";
import { WorkoutCard } from "./workout-card";

interface WorkoutListProps {
    workoutList: Workout[]
}

export function WorkoutList({ workoutList }: WorkoutListProps) {
    return (
        <>
            {workoutList.map((value) => {
                return <WorkoutCard workout={value} />;
            })}
        </>
    )
}