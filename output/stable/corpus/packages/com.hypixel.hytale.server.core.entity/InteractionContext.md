# InteractionContext

Type: class | Package: com.hypixel.hytale.server.core.entity

public class InteractionContext

Holds the full runtime context for an interaction chain execution. Tracks the held item (section ID, container, slot, stack), the owning and running-for entity references, the interaction manager, the current chain and entry, jump labels, a snapshot provider, and a `DynamicMetaStore` for interaction metadata. Provides methods for duplicating context, forking chains, and accessing interaction variables.
