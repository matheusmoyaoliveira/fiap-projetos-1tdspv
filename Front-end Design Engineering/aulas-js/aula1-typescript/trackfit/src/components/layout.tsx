import { Link, Outlet } from "react-router-dom";

export function Layout() {
  return (
    <>
      <nav
        style={{
          padding: "1.5rem",
        }}
      >
        <div
          style={{
            display: "flex",
            gap: "1rem",
          }}
        >
          <Link to="/">Home</Link>
          <Link to="/add">Novo treino</Link>
        </div>
      </nav>
      <Outlet />
    </>
  );
}