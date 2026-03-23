---
title: "BuilderDescriptorState"
kind: "enum"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderDescriptorState"
api_surface: false
extends: ~
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public enum BuilderDescriptorState
```

Defines the lifecycle state of a builder type or attribute. Used by [BuilderDescriptor](BuilderDescriptor.md) and [BuilderAttributeDescriptor](BuilderAttributeDescriptor.md) to communicate maturity and deprecation to tooling and documentation.

## Constants

| Constant | Description |
|---|---|
| `Unknown` | State has not been classified. |
| `WorkInProgress` | Under active development; may change without notice. |
| `Experimental` | Available for testing but not guaranteed stable. |
| `Stable` | Fully supported and expected to remain unchanged. |
| `Deprecated` | Scheduled for removal. The [Builder](Builder.md) interface's `isDeprecated()` default method checks for this value. |

## Related Types

- [BuilderDescriptor](BuilderDescriptor.md) -- uses this enum for builder-level state
- [BuilderAttributeDescriptor](BuilderAttributeDescriptor.md) -- uses this enum for attribute-level state
- [Builder](Builder.md) -- `isDeprecated()` checks against `Deprecated`
