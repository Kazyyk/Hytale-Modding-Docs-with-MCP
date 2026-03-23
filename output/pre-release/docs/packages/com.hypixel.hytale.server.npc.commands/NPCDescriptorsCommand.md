---
title: "NPCDescriptorsCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCDescriptorsCommand"
api_surface: false
extends: "AbstractAsyncPlayerCommand"
generator_version: "2.0.0"
generated_at: "2026-03-22T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public class NPCDescriptorsCommand extends AbstractAsyncPlayerCommand
```

Player command that generates and saves NPC descriptor data to `npc_descriptors.json` in the server's working directory. Executes asynchronously on the world thread. Registered as the `"descriptors"` sub-command under the NPC command group.

## Constructor

```java
public NPCDescriptorsCommand()
```

Registers as `"descriptors"` with description key `"server.commands.npc.descriptors.desc"`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `executeAsync(CommandContext, Store<EntityStore>, Ref<EntityStore>, PlayerRef, World)` | `CompletableFuture<Void>` | Calls `NPCPlugin.get().generateDescriptors()` and `saveDescriptors()`, then reports the output path. |
