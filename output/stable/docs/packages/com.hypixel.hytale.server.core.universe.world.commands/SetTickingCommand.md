---
title: "SetTickingCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.commands"
fqcn: "com.hypixel.hytale.server.core.universe.world.commands.SetTickingCommand"
api_surface: false
extends: "AbstractWorldCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "command"
  - "world"
  - "ticking"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.commands`

```java
public class SetTickingCommand extends AbstractWorldCommand
```

Server command that toggles world ticking on or off. Registered under the name `setticking`, accepts a required boolean argument to enable or disable ticking for the target world.

## Constructors

```java
public SetTickingCommand()
```

Registers the command as `setticking` with a required boolean `ticking` argument.

## Inherited Behavior

Overrides `execute(CommandContext, World, Store<EntityStore>)` from `AbstractWorldCommand`. Calls `world.setTicking(boolean)` and sends a translated status message to the command sender.
