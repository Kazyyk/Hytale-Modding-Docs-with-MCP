---
title: "ArgWrapper"
kind: "record"
package: "com.hypixel.hytale.server.core.command.system.arguments.system"
fqcn: "com.hypixel.hytale.server.core.command.system.arguments.system.ArgWrapper"
api_surface: true
extends: "WrappedArg<BasicType>, BasicType>( @Nonnull ArgumentType<BasicType> argumentType, @Nonnull Function<Argument<?, BasicType>, W> wrappedArgProviderFunction )"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "command"
  - "system"
  - "arguments"
  - "record"
---

**Package:** `com.hypixel.hytale.server.core.command.system.arguments.system`

```java
public record ArgWrapper<W extends WrappedArg<BasicType>, BasicType>( @Nonnull ArgumentType<BasicType> argumentType, @Nonnull Function<Argument<?, BasicType>, W> wrappedArgProviderFunction )
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `W` | `wrapArg(@Nonnull Argument<?, BasicType> argument)` |
