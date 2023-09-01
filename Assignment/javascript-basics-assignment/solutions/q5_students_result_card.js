// Write a program to display one result card of 100 students
// with their name and percentage
// Out of 100 students, 50 has subjects - Grammer and Accounts
// and other 50 has subjects -  Grammer and Physics

// Hint : You need to calculate percentage of 100 students having different set of subjects.
//        You can assume their scores on their respective subjects.
function calculatePercentage(score, totalMarks) {
    return (score / totalMarks) * 100;
}

const students = [];

for (let i = 1; i <= 100; i++) {
    const student = {
        name: `Student ${i}`,
        subjects: [],
    };

    if (i <= 50) {
        student.subjects.push({ name: "Grammar", score: Math.floor(Math.random() * 80) + 20 });
        student.subjects.push({ name: "Accounts", score: Math.floor(Math.random() * 80) + 20 });
    } else {
        student.subjects.push({ name: "Grammar", score: Math.floor(Math.random() * 80) + 20 });
        student.subjects.push({ name: "Physics", score: Math.floor(Math.random() * 80) + 20 });
    }

    students.push(student);
}

students.forEach(student => {
    const totalMarks = student.subjects.reduce((total, subject) => total + subject.score, 0);
    const percentage = calculatePercentage(totalMarks, student.subjects.length * 100);

    console.log(`${student.name}'s Result Card`);
    console.log("=======================");
    student.subjects.forEach(subject => {
        console.log(`${subject.name}: ${subject.score}`);
    });
    console.log(`Total Marks: ${totalMarks}`);
    console.log(`Percentage: ${percentage.toFixed(2)}%\n`);
});

// Write your code here
