---
title: "Options.RecoveryMode"
kind: "enum"
package: "com.hypixel.hytale.server.core"
fqcn: "com.hypixel.hytale.server.core.Options.RecoveryMode"
api_surface: false
extends: "java.lang.Enum"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "server"
  - "config"
  - "recovery"
---

**Package:** `com.hypixel.hytale.server.core`

```java
public static enum Options.RecoveryMode
```

Inner enum of `Options` that controls how broken chunks are handled during world verification and recovery. Used with the `--recovery-mode` CLI option (which requires `--verify-worlds`).

## Enum Constants

| Constant | Description |
|---|---|
| `FROM_BACKUP_OR_REGENERATE` | Attempt to restore the chunk from backup; if no backup exists, regenerate it |
| `REGENERATE` | Discard the broken chunk and regenerate it from world gen |

## Related Types

- `Options` -- parent class defining all CLI options
