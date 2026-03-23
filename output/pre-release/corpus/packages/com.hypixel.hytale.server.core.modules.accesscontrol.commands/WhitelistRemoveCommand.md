# WhitelistRemoveCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.accesscontrol.commands | Extends: AbstractAsyncCommand

public class WhitelistRemoveCommand extends AbstractAsyncCommand

## Fields

- @Nonnull private final HytaleWhitelistProvider whitelistProvider
- @Nonnull private final RequiredArg<ProfileServiceClient.PublicGameProfile> playerArg

## Constructors

- public WhitelistRemoveCommand(@Nonnull HytaleWhitelistProvider whitelistProvider)

## Methods

- @Nonnull @Override protected CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
