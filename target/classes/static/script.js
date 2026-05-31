function getCareer() {

    const name =
        document.getElementById("name").value;

    const branch =
        document.getElementById("branch").value;

    const skills =
        document.getElementById("skills").value;

    fetch("/career/recommend", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            name: name,
            branch: branch,
            year: "3",
            skills: skills,
            interest: "Software"
        })
    })
    .then(response => response.text())
    .then(data => {

        document.getElementById("result")
            .innerText = data;

    });
}