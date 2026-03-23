---
title: "FlagArg"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system.arguments.system"
fqcn: "com.hypixel.hytale.server.core.command.system.arguments.system.FlagArg"
api_surface: true
extends: "AbstractOptionalArg<FlagArg, Boolean>"
implements: ["AbstractOptionalArg.DefaultValueArgument<Boolean>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "command"
  - "system"
  - "arguments"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.command.system.arguments.system`

```java
public class FlagArg extends AbstractOptionalArg<FlagArg, Boolean> implements AbstractOptionalArg.DefaultValueArgument<Boolean>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `BooleanFlagArgumentType` | `BOOLEAN_FLAG_ARGUMENT_TYPE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull protected` | `FlagArg` | `getThis()` |
| `@Nonnull public` | `Boolean` | `getDefaultValue()` |
| `@Override @Nonnull public` | `Message` | `getUsageMessage()` |
| `@Override @Nonnull public` | `Message` | `getUsageOneLiner()` |
