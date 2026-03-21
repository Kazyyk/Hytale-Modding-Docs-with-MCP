---
title: "InteractionPriorityCodec"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.InteractionPriorityCodec"
api_surface: false
extends: ~
implements: ["Codec<InteractionPriority>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "interaction"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

```java
public class InteractionPriorityCodec implements Codec<InteractionPriority>
```

Custom codec that decodes an InteractionPriority from either an integer (default value) or a map of named priority slots.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `InteractionPriority` | `decode(@Nonnull BsonValue bsonValue, ExtraInfo extraInfo)` |
| `public` | `BsonValue` | `encode(@Nonnull InteractionPriority priority, ExtraInfo extraInfo)` |
| `public` | `InteractionPriority` | `decodeJson(@Nonnull RawJsonReader reader, ExtraInfo extraInfo)` |
| `public` | `Schema` | `toSchema(@Nonnull SchemaContext context)` |
