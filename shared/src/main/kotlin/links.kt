data class Links(var id: Int, var title: String, var link: String, var description: String)

val links = arrayOf(
        Links(
                1,
                "The Basics",
                "https://reactnative.dev/docs/tutorial",
                "Explains a Hello World for React Native."
        ),
        Links(
                2,
                "Style",
                "https://reactnative.dev/docs/style",
                "Covers how to use the prop named style which controls the visuals."
        ),
        Links(
                3,
                "Layout",
                "https://reactnative.dev/docs/flexbox",
                "React Native uses flexbox for layout, learn how it works."
        ),
        Links(
                4,
                "Components",
                "https://reactnative.dev/docs/components-and-apis",
                "The full list of components and APIs inside React Native."
        ),
        Links(
                5,
                "Navigation",
                "https://reactnative.dev/docs/navigation",

                "How to handle moving between screens inside your application."
        ),
        Links(
                6,
                "Networking",
                "https://reactnative.dev/docs/network",
                "How to use the Fetch API in React Native."
        ),
        Links(
                7,
                "Help",
                "https://reactnative.dev/help",
                "Need more help? There are many other React Native developers who may have the answer."
        ),
        Links(
                8,
                "Follow us on Twitter",
                "https://twitter.com/reactnative",

                "Stay in touch with the community, join in on Q&As and more by following React Native on Twitter."
        )
);
