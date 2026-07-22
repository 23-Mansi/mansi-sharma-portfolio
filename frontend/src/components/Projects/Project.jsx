import { useState, useEffect } from "react";
import { getProjects } from "../../api/projectApi";
import "./Project.css";


function Projects() {

  const [projects, setProjects] = useState([]);

  useEffect(() => {
      async function loadProjects() {
            try {
                const data = await getProjects();
                setProjects(data);
            } catch (error) {
                console.error(error);
            }
        }

        loadProjects();

    }, []);

  return (
    <section className="projects">

      <h1 className="projects-heading">
        Featured Projects
      </h1>

      <p className="projects-subheading">
        Projects I've built and continue building to solve real-world problems.
      </p>

      <div className="projects-grid">

        {projects.map((project) => (
          <div className="project-card" key={project.id}>

            <div className="video-box">
                <img className="project-image"
                src={project.imageUrl} alt={project.title}
              />
            </div>

            <div className="project-content">

              <h2>{project.title}</h2>

              <p>{project.description}</p>

              <div className="tech-tags">
                  {project.technology.split(",").map((tech) => (
                      <span key={tech}>
                          {tech.trim()}
                      </span>
                  ))}
              </div>

              <div className="project-buttons">

                <a href={project.githubLink}>
                  GitHub
                </a>

                <a href={project.liveDemo}>
                  Live Demo
                </a>

              </div>

            </div>

          </div>

        ))}

      </div>

    </section>
  );
}

export default Projects;