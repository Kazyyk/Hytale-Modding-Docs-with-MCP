---
title: "com.hypixel.hytale.server.core.command.system"
kind: "package"
package: "com.hypixel.hytale.server.core.command.system"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "command"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.command.system`

Core command framework. Provides the abstract command base class, argument types (required, optional, default, flag), tokenization, parsing, permission management, subcommand/variant dispatch, and the singleton `CommandManager` that registers and executes all server commands.

## Types

| Type | Kind | Description |
|---|---|---|
| [AbbreviationMap](AbbreviationMap.md) | class | Utility for prefix-based abbreviation matching of string keys to values. |
| [AbstractCommand](AbstractCommand.md) | class | Base class for the command system. |
| [CommandContext](CommandContext.md) | class | Holds the parsed argument values, input string, and sender reference for a single command invocation. |
| [CommandManager](CommandManager.md) | class | Singleton that registers all built-in commands, resolves command names and aliases, tokenizes input, and dispatches execution on the common `ForkJoinPool`. |
| [CommandOwner](CommandOwner.md) | interface | Marker interface for the entity that owns a command (either `PluginBase` or `CommandManager`). |
| [CommandRegistration](CommandRegistration.md) | class | Registration handle returned when a command is registered with `CommandManager`. |
| [CommandRegistry](CommandRegistry.md) | class | Plugin-scoped command registry that delegates to `CommandManager. |
| [CommandSender](CommandSender.md) | interface | Interface combining `IMessageReceiver` and `PermissionHolder`. |
| [CommandUtil](CommandUtil.md) | class | Static utility methods for command processing: stripping command name from input, requiring permissions. |
| [CommandValidationResults](CommandValidationResults.md) | class | Extends `ValidationResults` to bridge codec validation into the command `ParseResult` system. |
| [MatchResult](MatchResult.md) | class | Comparable result from fuzzy-matching a search term against command names, aliases, arguments, and descriptions. |
| [ParserContext](ParserContext.md) | class | Contextualizes tokenized command input into pre-optional single-value tokens, list tokens, and optional argument maps. |
| [ParseResult](ParseResult.md) | class | Accumulates failure messages during command parsing. |
| [Tokenizer](Tokenizer.md) | class | Splits raw command input into tokens, handling quoted strings, escape sequences, and list delimiters (`[`, `]`, `,`). |
