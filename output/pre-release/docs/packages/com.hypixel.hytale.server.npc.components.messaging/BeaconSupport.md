---
title: "BeaconSupport"
kind: "class"
package: "com.hypixel.hytale.server.npc.components.messaging"
fqcn: "com.hypixel.hytale.server.npc.components.messaging.BeaconSupport"
api_surface: false
extends: "MessageSupport"
implements: ["Component<EntityStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "components"
  - "messaging"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.components.messaging`

```java
public class BeaconSupport extends MessageSupport implements Component<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `NPCMessage[]` | `messageSlots` |
| `private` | `Object2IntMap<String>` | `messageIndices` |
| `private` | `Int2ObjectMap<String>` | `indicesToMessages` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, BeaconSupport>` | `getComponentType()` |
| `public` | `void` | `postMessage(String message, Ref<EntityStore> target, double age)` |
| `@Nullable public` | `Ref<EntityStore>` | `pollMessage(int messageIndex)` |
| `@Nullable public` | `Ref<EntityStore>` | `peekMessage(int messageIndex)` |
| `public` | `void` | `initialise(@Nonnull Object2IntMap<String> messageIndices)` |
| `public` | `String` | `getMessageTextForIndex(int messageIndex)` |
| `@Override public` | `NPCMessage[]` | `getMessageSlots()` |
| `@Nonnull @Override public` | `Component<EntityStore>` | `clone()` |
