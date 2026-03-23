---
title: "SelectorType"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector.SelectorType"
api_surface: false
extends: ~
implements: ["NetworkSerializable>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "interaction"
  - "selector"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector`

```java
public abstract class SelectorType implements NetworkSerializable<com.hypixel.hytale.protocol.Selector>
```

Abstract base class for interaction target selector configurations. Implements `NetworkSerializable` for packet serialization. Concrete subclasses define specific selection geometries (circle, cylinder, raycast, etc.) and produce `Selector` runtime instances.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static final` | `CodecMapCodec<SelectorType> CODEC = new` | `CodecMapCodec<>()` |
| `public static final` | `BuilderCodec<SelectorType> BASE_CODEC =` | `BuilderCodec.abstractBuilder(SelectorType.class).build()` |
| `public abstract` | `Selector` | `newSelector()` |
