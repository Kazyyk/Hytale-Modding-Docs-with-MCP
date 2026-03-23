# InteractionEntry

Type: class | Package: com.hypixel.hytale.server.core.entity

public class InteractionEntry

A single entry (step) within an interaction chain. Maintains server state (`InteractionSyncData`), optional simulation state, optional client state, timestamps, and a `DynamicMetaStore<Interaction>` for per-entry metadata. Tracks sync state including desynced detection and waiting-for-data timeouts.
