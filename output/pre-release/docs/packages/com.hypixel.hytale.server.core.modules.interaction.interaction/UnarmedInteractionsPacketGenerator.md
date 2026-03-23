---
title: "UnarmedInteractionsPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.UnarmedInteractionsPacketGenerator"
api_surface: false
extends: "DefaultAssetPacketGenerator<String, UnarmedInteractions>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
  - "packet"
  - "asset"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction`

```java
public class UnarmedInteractionsPacketGenerator extends DefaultAssetPacketGenerator<String, UnarmedInteractions>
```

Generates `UpdateUnarmedInteractions` packets for synchronizing unarmed interaction configuration to clients. Reads from the `"Empty"` unarmed interaction asset and maps `InteractionType` to indexed `RootInteraction` references.

## Key Methods

| Method | Return Type | Description |
|---|---|---|
| `generateInitPacket(DefaultAssetMap, Map)` | `ToClientPacket` | Creates an init packet with the default unarmed interactions |
| `generateUpdatePacket(Map)` | `ToClientPacket` | Creates an add/update packet for changed unarmed interactions |
| `generateRemovePacket(Set)` | `ToClientPacket` | Creates a remove packet |
