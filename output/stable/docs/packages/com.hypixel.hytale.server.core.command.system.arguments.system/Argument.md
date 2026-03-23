---
title: "Argument"
kind: "abstract class"
package: "com.hypixel.hytale.server.core.command.system.arguments.system"
fqcn: "com.hypixel.hytale.server.core.command.system.arguments.system.Argument"
api_surface: true
extends: "Argument<Arg, DataType>, DataType>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "command"
  - "system"
  - "arguments"
  - "abstract class"
---

**Package:** `com.hypixel.hytale.server.core.command.system.arguments.system`

```java
public abstract class Argument<Arg extends Argument<Arg, DataType>, DataType>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `String` | `name` |
| `private final` | `String` | `description` |
| `private final` | `ArgumentType<DataType>` | `argumentType` |
| `private` | `SuggestionProvider` | `suggestionProvider` |
| `private` | `List<Validator<DataType>>` | `validators` |
| `private final` | `AbstractCommand` | `commandRegisteredTo` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Arg` | `addValidator(@Nonnull Validator<DataType> validator)` |
| `public` | `void` | `validate(@Nonnull DataType data, @Nonnull ParseResult parseResult)` |
| `public` | `boolean` | `provided(@Nonnull CommandContext context)` |
| `public` | `DataType` | `get(@Nonnull CommandContext context)` |
| `@Nonnull protected abstract` | `Arg` | `getThis()` |
| `@Nullable public` | `DataType` | `getProcessed(@Nonnull CommandContext context)` |
| `public` | `Arg` | `suggest(@Nonnull SuggestionProvider suggestionProvider)` |
| `@Nonnull public` | `List<String>` | `getSuggestions(@Nonnull CommandSender sender, @Nonnull String[] textAlreadyEntered)` |
| `@Nonnull public abstract` | `Message` | `getUsageMessage()` |
| `@Nonnull public abstract` | `Message` | `getUsageOneLiner()` |
| `@Nonnull public` | `AbstractCommand` | `getCommandRegisteredTo()` |
| `@Nonnull public` | `String` | `getName()` |
| `@Nonnull public` | `ArgumentType<DataType>` | `getArgumentType()` |
| `@Nullable public` | `String` | `getDescription()` |
| `@Override @Nonnull public` | `String` | `toString()` |
