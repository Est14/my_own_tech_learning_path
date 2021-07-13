<div class="modal fade" id="addModalClient" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Add Client</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close">
                </button>
            </div>
            <form action="controller-servlet?action=insert" method="POST" class="was-validated">
                <div class="modal-body">
                    <div class="form-group">
                        <label  class="form-label">
                            <span>Name: </span>
                            <input type="text" class="form-control" name="name" required>
                        </label>
                    </div>
                    <div class="form-group">
                        <label  class="form-label">
                            <span>Last Name: </span>
                            <input type="text" class="form-control" name="lastName" required>
                        </label>
                    </div>
                    <div class="form-group">
                        <label  class="form-label">
                            <span>email: </span>
                            <input type="email" class="form-control" name="email" required>
                        </label>
                    </div>
                    <div class="form-group">
                        <label  class="form-label">
                            <span>Phone: </span>
                            <input type="tel" class="form-control" name="phone" required>
                        </label>
                    </div>
                    <div class="form-group">
                        <label  class="form-label">
                            <span>Balance: </span>
                            <input type="number" class="form-control" name="balance" required>
                        </label>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Save changes</button>
                </div>
            </form>
        </div>

    </div>
</div>

