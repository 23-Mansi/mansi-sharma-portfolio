const BASE_URL = "https://mansi-sharma-portfolio.onrender.com";

export async function getProjects() {
    const response = await fetch(`${BASE_URL}/projects`);

    if (!response.ok) {
        throw new Error("Failed to fetch projects");
    }

    return response.json();
}