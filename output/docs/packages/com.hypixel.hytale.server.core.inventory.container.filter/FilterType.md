---
title: "FilterType"
kind: "enum"
package: "com.hypixel.hytale.server.core.inventory.container.filter"
fqcn: "com.hypixel.hytale.server.core.inventory.container.filter.FilterType"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:58Z"
tags:
  - "inventory"
  - "filter"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container.filter`

```java
public enum FilterType
```

Global container filter controlling whether input (add) and output (remove) operations are permitted.

## Enum Constants

| Constant | Allow Input | Allow Output |
|---|---|---|
| `ALLOW_INPUT_ONLY` | Yes | No |
| `ALLOW_OUTPUT_ONLY` | No | Yes |
| `ALLOW_ALL` | Yes | Yes |
| `DENY_ALL` | No | No |

## Methods

```java
public boolean allowInput()
```

Returns `true` if items may be added to the container.

```java
public boolean allowOutput()
```

Returns `true` if items may be removed from the container.
