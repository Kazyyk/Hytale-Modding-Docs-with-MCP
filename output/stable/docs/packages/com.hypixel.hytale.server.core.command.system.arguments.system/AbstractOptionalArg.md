---
title: "AbstractOptionalArg"
kind: "interface"
package: "com.hypixel.hytale.server.core.command.system.arguments.system"
fqcn: "com.hypixel.hytale.server.core.command.system.arguments.system.AbstractOptionalArg"
api_surface: true
extends: "Argument<Arg, DataType>, DataType> extends Argument<Arg, DataType>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "command"
  - "system"
  - "arguments"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.command.system.arguments.system`

```java
public abstract class AbstractOptionalArg<Arg extends Argument<Arg, DataType>, DataType> extends Argument<Arg, DataType>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Set<String>` | `aliases` |
| `private` | `String` | `permission` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public final` | `Arg` | `addAliases(@Nonnull String... newAliases)` |
| `public` | `Arg` | `requiredIf(@Nonnull AbstractOptionalArg<?, ?> dependent, @Nullable AbstractOptionalArg<?, ?>... otherDependents)` |
| `public` | `Arg` | `requiredIf(@Nonnull AbstractOptionalArg<?, ?> dependent)` |
| `public` | `Arg` | `requiredIfAbsent(@Nonnull AbstractOptionalArg<?, ?> dependent, @Nullable AbstractOptionalArg<?, ?>... otherDependents)` |
| `public` | `Arg` | `requiredIfAbsent(@Nonnull AbstractOptionalArg<?, ?> dependent)` |
| `public` | `Arg` | `availableOnlyIfAll(@Nonnull AbstractOptionalArg<?, ?> dependent, @Nullable AbstractOptionalArg<?, ?>... otherDependents)` |
| `public` | `Arg` | `availableOnlyIfAll(@Nonnull AbstractOptionalArg<?, ?> dependent)` |
| `public` | `Arg` | `availableOnlyIfAllAbsent(@Nonnull AbstractOptionalArg<?, ?> dependent, @Nullable AbstractOptionalArg<?, ?>... otherDependents)` |
| `public` | `Arg` | `availableOnlyIfAllAbsent(@Nonnull AbstractOptionalArg<?, ?> dependent)` |
| `private` | `boolean` | `addDependencyArg( @Nonnull Set<AbstractOptionalArg<?, ?>> set, @Nullable Set<AbstractOptionalArg<?, ?>> oppositeSet, AbstractOptionalArg<?, ?> dependent, @Nullable AbstractOptionalArg<?, ?>... otherDependents )` |
| `public` | `boolean` | `verifyArgumentDependencies(@Nonnull CommandContext context, @Nonnull ParseResult parseResult)` |
| `@Nonnull public` | `Arg` | `setPermission(@Nonnull String permission)` |
| `@Nonnull public` | `Set<String>` | `getAliases()` |
| `@Nullable public` | `String` | `getPermission()` |
| `public` | `boolean` | `hasPermission(@Nonnull CommandSender sender)` |

## Inner Types

- `AbstractOptionalArg.DefaultValueArgument`
