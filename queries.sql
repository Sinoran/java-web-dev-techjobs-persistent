## Part 1: Test it with SQL
	employer: VARCHAR(255)
    id: int
    name: VARCHAR(255)
    skills: VARCHAR(255)

## Part 2: Test it with SQL
    SELECT name
    FROM employer
    WHERE location = 'St. Louis City';

## Part 3: Test it with SQL
    DROP TABLE jobs;

## Part 4: Test it with SQL
    SELECT skill.name, skill.description
    FROM skill
    LEFT JOIN job_skills ON skill.id = job_skills.skills_id
    WHERE jobs_id IS NOT NULL
    ORDER BY skill.name ASC, skill.description ASC;