import profile from "../../assets/Profile.jpeg";
import "./Hero.css"

function Hero() {
  return (
    <section className="hero">
      <div className="left">
      <p>Hello, I'm</p>
      <h1>Mansi Sharma</h1>
      <h3>Software Engineer | React | Java | Springboot</h3>
      <p>
        Like Java's philosophy—Write Once, Run Everywhere—I believe good code should work everywhere, solve real problems, and leave no room for bugs. Building scalable applications, one commit at a time. 
      </p>
      <div className="buttons">
        <button className="resume-btn">Download Resume</button>
        <button className="contact-btn">Contact Me</button>
      </div>
      
      </div>
      <div className="right">
        <img src={profile} alt="Profile Image"/>
      </div>
    </section>
    
  )
}

export default Hero;