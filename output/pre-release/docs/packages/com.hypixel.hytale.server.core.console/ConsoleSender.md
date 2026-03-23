---
title: "ConsoleSender"
kind: "class"
package: "com.hypixel.hytale.server.core.console"
fqcn: "com.hypixel.hytale.server.core.console.ConsoleSender"
api_surface: false
extends: ~
implements: 
  - "CommandSender"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "console"
---

**Package:** `com.hypixel.hytale.server.core.console`

```java
public class ConsoleSender implements CommandSender
```

Implementation of `CommandSender`.

## Constructors

| Constructor | Description |
|---|---|
| `ConsoleSender()` | Creates a new ConsoleSender instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `sendMessage(@Nonnull Message message)` | `void` | public method. |
| `getDisplayName()` | `String` | public method. |
| `getUuid()` | `UUID` | public method. |
| `hasPermission(@Nonnull String id)` | `boolean` | public method. |
| `hasPermission(@Nonnull String id, boolean def)` | `boolean` | public method. |
