# TRUEXTEND Coding Challenge

## Requested Position
Intermediate Java Software Engineer

## Personal Data
**Name**: Eduardo Andres Soruco Alderete

**Email**: easorucoa94@gmail.com

**Phone Number**: +591 70060600

## Scope
Having the following models:

- **Student** =  { sStudentName, dStudentLatitude, dStudentLongitude }

- **Class** =  { sClassName, dClassLatitude, dClassLongitude }

- **StudentAndClasses (Model that shows students and classes)** =  { studentList, classList }

Develop a **REST API** to run the following operations:

- Determine which students are physically in any classroom, based on both students and classes' latitude and longitude coordinates.

## Solution Details

This solution was built using Spring Boot and packed with Maven.

Database connection to a MySQL5.7 DataBase

## How to import this project

## Package distribution
- **com.truextend.secondProblem**: Contains Spring Boot's main class, needed to run the application.
- **com.truextend.secondProblem.controllers**: Contains all restControllers involved in this solution.
- **com.truextend.secondProblem.entities**: Contains actors entities/models.
- **com.truextend.secondProblem.services**: Contains the Service layer and its implementations **(~ServiceImpl.java)**
- **com.truextend.secondProblem.utils**: Contains the application utils. Methods that can be re-used in order to execute certain actions, not specific but general ones.


## Application endpoints
### http://{SERVER_URL}:{SERVER_PORT}/student
- **Path**: / (GET REQUEST) --- List all students

**Body**: none

**Reponse**: Collection of StudentEntity
```
[
    {
        "sStudentName": "John Wilson",
        "dStudentLatitude": 34.069149,
        "dStudentLongitude": -118.442639
    },
    {
        "sStudentName": "Jane Graham",
        "dStudentLatitude": 34.069601,
        "dStudentLongitude": -118.441862
    },
    {
        "sStudentName": "Pam Bam",
        "dStudentLatitude": 34.071513,
        "dStudentLongitude": -118.441181
    }
]
```

- **Path**: / (POST REQUEST) --- Register / Insert a new Student

**Body**: StudentEntity Object
```
{
    "sStudentName": "John Wilson",
    "dStudentLatitude": 34.069149,
    "dStudentLongitude": -118.442639
}
```

**Reponse**: StudentEntity Object
```
{
    "sStudentName": "John Wilson",
    "dStudentLatitude": 34.069149,
    "dStudentLongitude": -118.442639
}
```

- **Path**: /attending (POST REQUEST) --- Checks students physically in their classrooms by lat and long

**Body**: StudentAndClassesEntity Object
```
{
    "studentList": [
        {
            "sStudentName": "John Wilson",
            "dStudentLatitude": 34.069849,
            "dStudentLongitude": -118.443539
        },
        {
            "sStudentName": "Jane Graham",
            "dStudentLatitude": 34.069901,
            "dStudentLongitude": -118.441562
        },
        {
            "sStudentName": "Pam Bam",
            "dStudentLatitude": 34.071523,
            "dStudentLongitude": -118.441171
        }
    ],
    "classList": [
        {
            "sClassName": "Principles of computational geo-location analysis",
            "dClassLatitude": 34.06914,
            "dClassLongitude": -118.442689
        },
        {
            "sClassName": "Sedimentary Petrology",
            "dClassLatitude": 34.069585,
            "dClassLongitude": -118.441878
        },
        {
            "sClassName": "Introductory Psychobiology",
            "dClassLatitude": 34.069742,
            "dClassLongitude": -118.441312
        },
        {
            "sClassName": "Art of Listening",
            "dClassLatitude": 34.070223,
            "dClassLongitude": -118.440193
        },
        {
            "sClassName": "Art Hitory",
            "dClassLatitude": 34.071528,
            "dClassLongitude": -118.441211
        }
    ]
}
```

**Reponse**: Collection of StudentEntity Object
```
[
    {
        "sStudentName": "Pam Bam",
        "dStudentLatitude": 34.071523,
        "dStudentLongitude": -118.441171
    }
]
```

### http://{SERVER_URL}:{SERVER_PORT}/class
- **Path**: / (GET REQUEST) --- List all classes

**Body**: none

**Reponse**: Collection of ClassEntity
```
[
    {
        "sClassName": "Principles of computational geo-location analysis",
        "dClassLatitude": 34.06914,
        "dClassLongitude": -118.442689
    },
    {
        "sClassName": "Sedimentary Petrology",
        "dClassLatitude": 34.069585,
        "dClassLongitude": -118.441878
    },
    {
        "sClassName": "Introductory Psychobiology",
        "dClassLatitude": 34.069742,
        "dClassLongitude": -118.441312
    },
    {
        "sClassName": "Art of Listening",
        "dClassLatitude": 34.070223,
        "dClassLongitude": -118.440193
    },
    {
        "sClassName": "Art Hitory",
        "dClassLatitude": 34.071528,
        "dClassLongitude": -118.441211
    }
]
```

- **Path**: / (POST REQUEST) --- Register / Insert a new Class

**Body**: ClassEntity Object
```
{
    "sClassName": "Art Hitory",
    "dClassLatitude": 34.071528,
    "dClassLongitude": -118.441211
}
```

**Reponse**: ClassEntity Object
```
{
    "sClassName": "Art Hitory",
    "dClassLatitude": 34.071528,
    "dClassLongitude": -118.441211
}
```
