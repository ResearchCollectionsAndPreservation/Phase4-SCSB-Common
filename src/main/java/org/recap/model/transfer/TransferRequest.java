package org.recap.model.transfer;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by sheiks on 12/07/17.
 */
@Getter
@Setter
public class TransferRequest {
    private String institution;
    private List<HoldingsTransferRequest> holdingTransfers;
    private List<ItemTransferRequest> itemTransfers;
}
