# EntityStatMap.Predictable

Type: enum | Package: com.hypixel.hytale.server.core.modules.entitystats

public static enum EntityStatMap.Predictable

Controls client-side prediction for stat updates. When a stat change is predictable, the client can apply it immediately without waiting for server confirmation.

## Enum Constants

- NONE | Not predictable by any viewer.
- SELF | Predictable by the entity's own client only.
- ALL | Predictable by all viewers (self and others).
