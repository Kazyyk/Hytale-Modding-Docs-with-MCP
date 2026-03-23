---
title: "CollectorTag"
kind: "interface"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.data"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.data.CollectorTag"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.data`

```java
public interface CollectorTag
```

Marker interface for tags used during interaction data collection. Tags identify the kind of data being collected at each node of the interaction tree. Provides a static `ROOT` sentinel instance.

## Fields

| Field | Type | Description |
|---|---|---|
| `ROOT` | `CollectorTag` | Static sentinel tag representing the root of a collection tree. |
