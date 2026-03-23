---
title: "CommandSender"
kind: "interface"
package: "com.hypixel.hytale.server.core.command.system"
fqcn: "com.hypixel.hytale.server.core.command.system.CommandSender"
api_surface: true
extends: ~
implements: ["com.hypixel.hytale.server.core.receiver.IMessageReceiver", "com.hypixel.hytale.server.core.permissions.PermissionHolder"]
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "command"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.command.system`

```java
public interface CommandSender
```

Interface combining `IMessageReceiver` and `PermissionHolder`. Adds `getDisplayName()` and `getUuid()` for identifying the entity executing a command.
