---
title: "UnbanCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.accesscontrol.commands"
fqcn: "com.hypixel.hytale.server.core.modules.accesscontrol.commands.UnbanCommand"
api_surface: false
extends: "AbstractAsyncCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "accesscontrol"
  - "commands"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.accesscontrol.commands`

```java
public class UnbanCommand extends AbstractAsyncCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `HytaleBanProvider` | `banProvider` |
| `@Nonnull private final` | `RequiredArg<ProfileServiceClient.PublicGameProfile>` | `playerArg` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `UnbanCommand(@Nonnull HytaleBanProvider banProvider)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override protected` | `CompletableFuture<Void>` | `executeAsync(@Nonnull CommandContext context)` |
