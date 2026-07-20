import "./TechStack.css";

function TechStack() {
  const skills = ["HTML", "CSS", "JavaScript", "React", "Java","Spring Boot","MySQL","Git","GitHub","IntelliJ IDEA","Postman","Maven", "Vercel"]
  return(
  <section className="tech-stack">
    <h1 className="tech-heading">Tech Stack</h1>
    <p className="tech-subheading">
      The technologies I use to turn ideas into real-world applications.
    </p>

    <div className="tech-grid">
      {
        skills.map((skill) => (
          <div className="tech-card" key={skill}>
            <h3>{skill}</h3>
            </div>

        ))
      }
    </div>
  </section>     
  );
}

export default TechStack;