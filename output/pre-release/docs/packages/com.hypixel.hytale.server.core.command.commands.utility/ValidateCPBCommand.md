---
title: "ValidateCPBCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.utility"
fqcn: "com.hypixel.hytale.server.core.command.commands.utility.ValidateCPBCommand"
api_surface: false
extends: "AbstractAsyncCommand"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "command"
---
**Package:** `com.hypixel.hytale.server.core.command.commands.utility`

```java
public class ValidateCPBCommand extends AbstractAsyncCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `String` | `UNABLE_TO_LOAD_MODEL` |
| `private static final` | `String` | `FAILED_TO_FIND_BLOCK` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `ValidateCPBCommand()` |
| `protected` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context)` |
| `private static` | `void` | `convertPrefabs(@Nonnull CommandContext context, @Nonnull Path assetPath)` |
