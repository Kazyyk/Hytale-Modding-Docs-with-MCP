# CommandManager

Type: class | Package: com.hypixel.hytale.server.core.command.system | Implements: com.hypixel.hytale.server.core.command.system.CommandOwner

public class CommandManager

Singleton that registers all built-in commands, resolves command names and aliases, tokenizes input, and dispatches execution on the common `ForkJoinPool`. Implements `CommandOwner`.
