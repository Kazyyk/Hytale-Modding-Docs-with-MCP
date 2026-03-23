# HandshakeHandler

Type: class | Package: com.hypixel.hytale.server.core.io.handlers.login | Extends: GenericConnectionPacketHandler

public abstract class HandshakeHandler extends GenericConnectionPacketHandler

Abstract handler for the login handshake flow. Validates the client's identity token (JWT) against the session service, performs mutual authentication via authorization grants and server token exchange, and optionally generates a password challenge. Manages the multi-stage authentication state machine: `REQUESTING_AUTH_GRANT` -> `AWAITING_AUTH_TOKEN` -> `PROCESSING_AUTH_TOKEN` -> `EXCHANGING_SERVER_TOKEN` -> `AUTHENTICATED`.

## Methods


@Override
public void accept(@Nonnull ToServerPacket packet)

Dispatches incoming packets to `Disconnect` or `AuthToken` handlers.


@Override
public void registered0(PacketHandler oldHandler)

Validates the identity token, checks UUID match and required scope, then begins the auth grant request.


public void handle(@Nonnull Disconnect packet)

Handles client disconnect during handshake.


public void handle(@Nonnull AuthToken packet)

Validates the client's access token JWT, verifies UUID and username match, then initiates server auth grant exchange.


protected abstract void onAuthenticated(byte[] var1)

Called when authentication completes. Subclasses define the next step (e.g., password or game handler).
