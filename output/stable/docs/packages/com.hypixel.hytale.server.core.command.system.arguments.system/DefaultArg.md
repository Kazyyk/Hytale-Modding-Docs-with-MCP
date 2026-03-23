---
title: "DefaultArg"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system.arguments.system"
fqcn: "com.hypixel.hytale.server.core.command.system.arguments.system.DefaultArg"
api_surface: true
extends: "AbstractOptionalArg<DefaultArg<DataType>, DataType>"
implements: ["AbstractOptionalArg.DefaultValueArgument<DataType>"]
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
public class DefaultArg<DataType> extends AbstractOptionalArg<DefaultArg<DataType>, DataType> implements AbstractOptionalArg.DefaultValueArgument<DataType>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `DataType` | `defaultValue` |
| `private final` | `String` | `defaultValueDescription` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull protected` | `DefaultArg<DataType>` | `getThis()` |
| `@Override public final` | `DataType` | `getDefaultValue()` |
| `public` | `void` | `validateDefaultValue(@Nonnull ParseResult parseResult)` |
| `@Override @Nonnull public` | `Message` | `getUsageMessage()` |
| `@Override @Nonnull public` | `Message` | `getUsageOneLiner()` |
| `@Nonnull public` | `String` | `getDefaultValueDescription()` |
