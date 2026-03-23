# Options.RecoveryMode

Type: enum | Package: com.hypixel.hytale.server.core | Extends: java.lang.Enum

public static enum Options.RecoveryMode

Inner enum of `Options` that controls how broken chunks are handled during world verification and recovery. Used with the `--recovery-mode` CLI option (which requires `--verify-worlds`).

## Enum Constants

- FROM_BACKUP_OR_REGENERATE | Attempt to restore the chunk from backup; if no backup exists, regenerate it
- REGENERATE | Discard the broken chunk and regenerate it from world gen

## Related Types

- `Options` -- parent class defining all CLI options
