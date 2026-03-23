# InteractionChain

Type: class | Package: com.hypixel.hytale.server.core.entity | Implements: ChainSyncStorage

public class InteractionChain implements ChainSyncStorage

Represents a running interaction chain with server/client synchronization. Tracks the interaction type, chain data, operation counter, call stack, forked chains, root interaction, and synchronization state. Manages the lifecycle of interactions from first run through completion, handling client-server state reconciliation, fork management, and operation index tracking.
