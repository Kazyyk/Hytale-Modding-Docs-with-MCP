---
title: "KillCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.player"
fqcn: "com.hypixel.hytale.server.core.command.commands.player.KillCommand"
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
public class KillCommand extends AbstractPlayerCommand
```

Server command that instantly kills a player by adding a `DeathComponent` with maximum damage. Supports self and other-player targeting.
