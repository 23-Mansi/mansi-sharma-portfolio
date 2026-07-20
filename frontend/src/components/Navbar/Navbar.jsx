import "./Navbar.css"

function Navbar() {
  const menu = ["Home", "About", "Skills", "Projects", "Contact"];

  return (
    <nav className="navbar">
      <h2 className="logo">Portfolio</h2>

      <ul className="menu">
        {
          menu.map((item) => (
            <li key={item}>
              {item}
            </li>
          ))
        }
      </ul>

    </nav>
  )
}

export default Navbar;