import "./DeveloperDiary.css"

function DeveloperDiary() {
  return (
    <section className="developer-diary">
      <div className="container"> 
        <h1 className="title">Developer Diary</h1>

        <p className="quote"> 
          "The best environment isn't always the one you're given.
          Sometimes it's the one you create."
        </p>
        <div className="story">
          <p>
            I didn't start with the perfect environment or a roadmap—I started
            with curiosity and a decision to keep learning.
          </p>
          
          <p>
            Coming from a <span>Tier-3 college</span>, I quickly realized there
            wasn't much of a coding culture around me. Most people around me
            weren't exploring software development, and finding a community to
            learn with wasn't easy. Instead of waiting for the right
            environment, I chose to become my own.
          </p>

          <p>
            I started learning on my own—<span>one tutorial, one bug, one
            project, and one challenge at a time.</span> Every small step
            strengthened my confidence and reminded me that consistency matters
            more than having the perfect starting point.
          </p>

          <p>
            I started learning to solve my own problems. Today, I'm building projects to solve real ones—and this is just Chapter One.
          </p>

        </div>
      </div>  
    </section>
  );
}

export default DeveloperDiary;