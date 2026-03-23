---
title: "MacroCommandBase"
kind: "class"
package: "com.hypixel.hytale.builtin.commandmacro"
fqcn: "com.hypixel.hytale.builtin.commandmacro.MacroCommandBase"
api_surface: false
extends: "AbstractAsyncCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "builtin"
  - "commandmacro"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.commandmacro`

```java
public class MacroCommandBase extends AbstractAsyncCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Pattern` | `regexBracketPattern` |
| `private static final` | `Pattern` | `PATTERN` |
| `private final Map<String,` | `String>` | `defaultValueStrings` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable private <D>` | `Argument<?, ?>` | `withDefaultArg( String name, String description, @Nonnull ArgumentType<D> argumentType, @Nonnull String defaultValue, String defaultValueDescription, @Nonnull ParseResult parseResult )` |
| `@Override @Nonnull protected` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context)` |
