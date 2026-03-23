---
title: "DiscoverInstanceEvent"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.event"
fqcn: "com.hypixel.hytale.builtin.instances.event.DiscoverInstanceEvent"
api_surface: false
extends: "EcsEvent"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "instances"
  - "event"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.instances.event`

```java
public abstract class DiscoverInstanceEvent extends EcsEvent
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `UUID` | `instanceWorldUuid` |
| `private final` | `InstanceDiscoveryConfig` | `discoveryConfig` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `UUID` | `getInstanceWorldUuid()` |
| `@Nonnull public` | `InstanceDiscoveryConfig` | `getDiscoveryConfig()` |

## Inner Types

- `DiscoverInstanceEvent.Display`
