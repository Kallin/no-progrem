Welcome to the 'No Progrem' project; an exercise in illustrating solutions to a wide range of programming problems across as many languages as possible.

## Goals

*No Progrem* has a number of goals, of which only a limited number are currently being achieved.

1. Collect a wide range of programming problems and store them in a language-agnostic format (currently JSON).
2. Allow problems to declare and give credit to their source (in this case they're all from Project Euler).
3. Allow problems to provide all relevant input for any language to consume, and declare the solution so that each implementation can be verified.
4. Provide solutions to problems in as many languages as possible. *Gradle* looks like a promising avenue for building many different languages.
5. Provide discussion of the many solutions for each problem. There ought to be a number of solutions for each problem that are implemented in all languages.
6. Allow each language to offer it's own unique solution to a problem if it has a language feature that makes a solution significantly more readable.
7. Ensure each solution is written in an idiomatic fashion for the given language.
8 (maybe) allow libraries to be used for supplementary solutions if they offer a substantial improvement in readability
9. Allow execution of all solutions via *Gradle*.
10. Generate a report of solution execution, illustrating execution time etc.
11. (maybe) Run solutions in CI, across different hardware, for consistency and improved meaning to reports.
12. A website should be built to allow easy browsing of problems, solutions, execution reports etc, pulling in pieces from Github and CI.
13. Website should offer commenting, though this could also be achieved via github.

## Layout

Standard Gradle layout. Will offer further details once form evolves.

## Instructions

The only solutions that currently exist are in the groovy project. There is a 'SolutionExecutor' class that has a main method you can run. This can be accomplished easily by running 'gradlew run'. If executing via your IDE, be sure to set the working dir to the root of this project.

## Contributing

This project ought to evolve through the collective work and wisdom of as wide a development community as possible. Determining what are the 'best' solutions is a subjective task, and all input is welcome. Hopefully, through the transparency of open source and healthy discussion, all of the solutions can evolve to a state that most would agree is an *ideal* state. So, please, create pull requests, offer your solutions, and help this grow into something great!