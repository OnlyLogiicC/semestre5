<template>
    <div class="row">
                <div class="col mt-3">
                    <div class="card">
                        <div class="card-header">
                            Global configuration
                        </div>
                        <div class="card-body">
                            <div class="form-row">
                                <label for="inputName">Name</label>
                                <input type="text" class="form-control" id="inputName">
                            </div>
                            <div class="form-row">
                                <label for="inputDescription">Full description</label>
                                <textarea class="form-control" id="inputDescription" rows="3"></textarea>
                            </div>

                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="inputTemplateID">Template ID</label>
                                    <input type="text" class="form-control" id="inputTemplateID">
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="inputHostnameTemplate">Hostname template</label>
                                    <input type="text" class="form-control" id="inputHostnameTemplate">
                                </div>
                            </div>

                            <div class="form-row">
                                <div class="form-group col-md-3">
                                    <label for="inputMemory">Memory</label>
                                    <input type="text" class="form-control" id="inputMemory">
                                </div>
                                <div class="form-group col-md-3">
                                    <label for="inputDisksize">Disk size</label>
                                    <input type="text" class="form-control" id="inputDisksize">
                                </div>
                                <div class="form-group col-md-3">
                                    <label for="inputCore">Core</label>
                                    <input type="text" class="form-control" id="inputCore">
                                </div>
                                <div class="form-group col-md-3">
                                    <label for="inputSocket">Socket</label>
                                    <input type="text" class="form-control" id="inputSocket">
                                </div>
                            </div>

                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="inputLogin">Login</label>
                                    <input type="text" class="form-control" id="inputLogin">
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="inputPassword">Password</label>
                                    <input type="text" class="form-control" id="inputPassword">
                                </div>
                            </div>

                            <div class="form-row">
                                <label for="inputSSHKey">SSH key</label>
                                <textarea class="form-control" id="inputSSHKey" rows="3"></textarea>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    </template>

<script>
import VirtualMachine from "@/components/VirtualMachine.vue";

export default {
  name: "Common",
  components: {
    VirtualMachine,
  }
};
</script>
