---
title: "PlayerRespawnCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.player"
fqcn: "com.hypixel.hytale.server.core.command.commands.player.PlayerRespawnCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "command"
  - "player"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.player`

```java
public class PlayerRespawnCommand extends AbstractPlayerCommand
```

Server command that forces a player to respawn via `DeathComponent.respawn()`. Supports self and other-player targeting.
